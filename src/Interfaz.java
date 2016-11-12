import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Jonnathan on 09/11/2016.
 */
public class Interfaz extends JFrame{
    private JPanel pnlFileChooser;
    private JPanel pnlAddRaod;
    private JPanel pnlRemoveRoad;
    private JTextField textField1;
    private JButton btnExaminar;
    private JLabel lbl1;
    private JPanel cmbResulCity2;
    private JLabel lbl2;
    private JComboBox cmbResulCity1;
    private JComboBox comboBox2;
    private JButton btnCalcularRutaMasCorta;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lblRutaMasCortaResult;
    private JLabel lbl6;
    private JLabel lblCentroDelGrafoResult;
    private JComboBox cmbBlockCiudad1;
    private JComboBox cmbBlockCiudad2;
    private JButton btnBloquear;
    private JLabel lbl10;
    private JLabel lbl9;
    private JLabel lbl8;
    private JLabel lbl7;
    private JComboBox comboBox1;
    private JComboBox comboBox3;
    private JTextField textField2;
    private JButton button1;
    String source = "";
    ArrayList<String> diccionario;
    diccionario = new ArrayList<String>();
    diccionario = new ArrayList<String>();
    public Interfaz() {
        btnExaminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
         codigo tomado de :
         http://stackoverflow.com/questions/7494478/jfilechooser-from-a-command-line-program-and-popping-up-underneath-all-windows
         */
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new java.io.File("./src"));
                chooser.setDialogTitle("Seleccione su archivo");
                chooser.setFileFilter(new FileNameExtensionFilter("Text files (.txt)", "txt"));
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {

                    try {
						/*Lee el archivo y obtiene la cadena*/
                        FileInputStream fstream = new FileInputStream(chooser.getSelectedFile().getAbsolutePath());
                        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                        String strLine;
                        while ((strLine = br.readLine()) != null) {
                            diccionario.add(strLine); //agregar cada linea al diccionario
                        }

                /* Separar cadenas y hacer asociacion */
                        for (int i = 0; i < diccionario.size(); i++) {
                            String temp = diccionario.get(i).substring(1, diccionario.get(i).length() - 1);
                            String[] partes = temp.split(", ");
                        }
                    } catch (Exception e) {
                        System.out.println("Archivo no valido!!!");
                    }
                }
            }
        });
    }
}
