package Vista;

import BLL.ClientBLL;
import Entitat.Client;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel Espinosa Torres
 */
public class ClientTableModel2 extends AbstractTableModel {

    ArrayList clientData = new ArrayList<>();
    ArrayList auxClientData = new ArrayList<>();
    String[] clientColumns = {
        "DNI", "Nom", "Carrer", "Codi postal", "Nº de portal"
    };

    Class[] types = new Class[]{
        java.lang.String.class, java.lang.String.class, java.lang.String.class,
        java.lang.String.class, java.lang.String.class, java.lang.String.class
    };

    public ClientTableModel2() {
        try {
            clientData = (ArrayList<Client>) new ClientBLL().obtenirClients();
        } catch (Exception ex) {
            Logger.getLogger(ClientTableModel2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getColumnName(int col) {
        return clientColumns[col];
    }

    @Override
    public int getRowCount() {
        return clientData.size();
    }

    @Override
    public int getColumnCount() {
        return clientColumns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Client client = (Client) clientData.get(row);

        Object result = null;
        switch (col) {
            case 0:
                result = client.getDni();
                break;
            case 1:
                result = client.getNom();
                break;
            case 2:
                result = client.getCarrer();
                break;
            case 3:
                result = client.getCodi_postal();
                break;
            case 4:
                result = client.getN_de_portal();
                break;
        }
        return result;
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        Client client = (Client) clientData.get(row);

        if (client.getCodi_id() == null) { // INSERT
            try {
                ClientBLL cbll = new ClientBLL();
                client.setCodi_id(cbll.maxCodi());

                switch (col) {
                    case 0:
                        client.setDni(value.toString());
                        break;
                    case 1:
                        client.setNom(value.toString());
                        break;
                    case 2:
                        client.setCarrer(value.toString());
                        break;
                    case 3:
                        client.setCodi_postal(value.toString());
                        break;
                    case 4:
                        client.setN_de_portal(value.toString());
                        break;
                }

                cbll.insertClient(client);
            } catch (Exception ex) {
                System.out.println("No s'ha pogut inserir el client.");
            }
        } else { // UPDATE
            try {
                switch (col) {
                    case 0:
                        client.setDni(value.toString());
                        break;
                    case 1:
                        client.setNom(value.toString());
                        break;
                    case 2:
                        client.setCarrer(value.toString());
                        break;
                    case 3:
                        client.setCodi_postal(value.toString());
                        break;
                    case 4:
                        client.setN_de_portal(value.toString());
                        break;
                }

                ClientBLL cbll = new ClientBLL();
                cbll.updateClient(client);
            } catch (Exception ex) {
                System.out.println("No s'ha pogut actualitzar el client.");
            }
        }
        fireTableCellUpdated(row, col);
    }

    public void addClient(Client client, int row) {
        if (client.getCodi_id() == null) {
            try {
                client.setCodi_id(new ClientBLL().maxCodi());

                new ClientBLL().insertClient(client);

                // Add row:
                clientData.add(client);
                fireTableDataChanged();
            } catch (Exception ex) {
                System.out.println("No s'ha pogut inserir el client.");
            }
        } else {
            try {
                new ClientBLL().updateClient(client);

                clientData.remove(row);
                clientData.add(row, client);
                fireTableDataChanged();
            } catch (Exception ex) {
                System.out.println("No s'ha pogut actualitzar el client.");
            }
        }
    }

    public void removeRow(int row) {
        Client client = (Client) clientData.get(row);

        try {
            new ClientBLL().deleteClient(client);

            clientData.remove(client);
            fireTableDataChanged();
        } catch (Exception ex) {
            System.out.println("No s'ha pogut eliminar el client.");
        }
    }

    // Mètodes per a la búsqueda de clients:
    // Alternative 1 (OK):
    public void updateData(String searchText) {
        // Primera lletra.
        if (auxClientData.isEmpty()) {
            auxClientData = (ArrayList<Client>) clientData.clone();
        }

        if (searchText.length() == 0) { // Búsqueda des de zero.
            clientData.removeAll(clientData);
            clientData = (ArrayList<Client>) auxClientData.clone();
        } else {
            for (int i = 0; i < auxClientData.size(); i++) {
                Client c = (Client) auxClientData.get(i);

                if (!c.getNom().toLowerCase().contains(searchText.toLowerCase())) {
                    clientData.remove(c);
                }
            }
        }

        fireTableDataChanged();
    }

    // Alternative 2:
    public void performSearch(int selectedColum, String searchText) {
        try {
            clientData = (ArrayList<Client>) new ClientBLL().filterClients(selectedColum, searchText);
            fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(ClientTableModel2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
