package Vista;

import BLL.PetBLL;
import Entitat.Pet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel Espinosa Torres
 */
public class PetTableModel extends AbstractTableModel {

    ArrayList petData = new ArrayList<>();
    String[] petColumns = {
        "Nom", "Chip", "Comentaris", "Historial"
    };

    Class[] types = new Class[]{
        java.lang.String.class, java.lang.String.class, java.lang.String.class,
        java.lang.String.class
    };

    public PetTableModel(String codi_id) {
        try {
            petData = (ArrayList<Pet>) new PetBLL().obtenirMascotes(codi_id);
        } catch (Exception ex) {
            Logger.getLogger(ClientTableModel1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getColumnName(int col) {
        return petColumns[col];
    }

    @Override
    public int getRowCount() {
        return petData.size();
    }

    @Override
    public int getColumnCount() {
        return petColumns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Pet pet = (Pet) petData.get(row);

        Object result = null;
        switch (col) {
            case 0:
                result = pet.getNom();
                break;
            case 1:
                result = pet.getData_naixment();
                break;
            case 2:
                result = pet.getChip();
                break;
            case 3:
                result = pet.getComentaris();
                break;
            case 4:
                result = pet.getHistorial();
                break;
            case 5:
                result = pet.getCodi_id();
                break;
            case 6:
                result = pet.getData();
                break;
            case 7:
                result = pet.getTractament();
                break;
            case 8:
                result = pet.getEspecie();
                break;
        }
        return result;
    }
}
