


package Vista;
import vista.Registrar;
import vista.Reporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
    
    private JButton registrarVentaButton;
    private JButton verReporteButton;

    public Home() {
        super("Inicio");
        initComponents();
        //Codigo aquí
      
    }
    

    private void initComponents() {
        this.setLocationRelativeTo(null);

        registrarVentaButton = new javax.swing.JButton();
        verReporteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrarVentaButton.setText("Registrar Venta");
        

        verReporteButton.setText("Ver Reporte");

       registrarVentaButton.addActionListener(this);
       verReporteButton.addActionListener(this);
       registrarVentaButton.setActionCommand("hola");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrarVentaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(verReporteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(registrarVentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verReporteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
                
        );

        pack();
    }

  
    @Override
    public void actionPerformed(ActionEvent ae) {
         String g = ae.getActionCommand();  
        if (g.equals("hola")) {
            
            accionregistrarVentaButton();
            
        } else {
          
           accionverReporteButton();
        }
    }
    
  private void accionverReporteButton(){
        
       Reporte v = new Reporte ();
       v.setVisible(true);
       
        
        
    }
    
    private void accionregistrarVentaButton(){
    
     
     
     Registrar v2 = new Registrar();
       v2.setVisible(true);
    
    
        
    }
    

    
    
}
  

