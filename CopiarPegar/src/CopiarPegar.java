import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class CopiarPegar extends JFrame{
  
    private JLabel labeltitulo = new JLabel("Titulo");
    private JLabel labelPegar = new JLabel("Texto copiado");
    private JTextField textCopiar = new JTextField(20);
    private JButton btnCopiar = new JButton("Copiar");
    private JButton btnPegar = new JButton("Pegar");
    private String Texto;
    
    public CopiarPegar(){
        
        setTitle("Copiar y Pegar");//TÍTULO DE LA VENTANA
        setSize(350, 300);//TAMAÑO EN PIXELES
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CERRAR DE MANERA CORRECTA
        setLocationRelativeTo(null); //CENTRAR LA VENTANA
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10)); //ALINEAR OBJETOS A LA IZQUIERDA
    }
    
    public void Componentes(CopiarPegar ventana){
        
        ventana.add(labeltitulo);
        ventana.add(textCopiar);
        ventana.add(btnCopiar);
        ventana.add(labelPegar);
        ventana.add(btnPegar);
        
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {  
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                btnCopiarAction(evt);
            }
        });
        
        btnPegar.addActionListener(new java.awt.event.ActionListener() {  
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                btnPegarAction(evt);
            }
        });
    }
    
    private void btnCopiarAction(ActionEvent evt) {
        Texto = textCopiar.getText();
    }
    
    private void btnPegarAction(ActionEvent evt) {
        labelPegar.setText(Texto);  
    }
    
    public static void main(String[] args) {
        
        CopiarPegar ventana = new CopiarPegar();//VENTANA
        ventana.setVisible(true);//PARA QUE SEA VISIBLE
        ventana.Componentes(ventana);
        
    }
    
}
