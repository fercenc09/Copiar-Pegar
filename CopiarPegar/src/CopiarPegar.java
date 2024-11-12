import java.awt.FlowLayout;
import javax.swing.*;


public class CopiarPegar extends JFrame{
  
    private JLabel labeltitulo = new JLabel("Copiar y Pegar");
    private JLabel labelPegar = new JLabel("Texto a Copiar");
    private JTextField textCopiar = new JTextField(30);
    private JButton btnCopiar = new JButton("Copiar: ");
    private JButton btnPegar = new JButton("Pegar: ");
    
    public CopiarPegar(){
        
        setTitle("Copiar y Pegar");//TÍTULO DE LA VENTANA
        setSize(500, 500);//TAMAÑO EN PIXELES
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CERRAR DE MANERA CORRECTA
        setLocationRelativeTo(null); //CENTRAR LA VENTANA
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20)); //ALINEAR OBJETOS A LA IZQUIERDA
    }
    
    public static void main(String[] args) {
        
        CopiarPegar ventana = new CopiarPegar();//VENTANA
        ventana.setVisible(true);//PARA QUE SEA VISIBLE
    }
    
}
