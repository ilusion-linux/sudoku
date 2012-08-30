package sudoku;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDialog;

public class FrmNivel extends JDialog implements MouseListener, ItemListener
{
    private Cargar configuracion;
    private String tema;
    private String aleatoriedad;
    private int dificultad;

    public FrmNivel(Frame parent, boolean modal, Cargar cargar)
    {
        super(parent, modal);
        configuracion=cargar;
        tema=configuracion.tema;
        initComponents();
        this.setTitle(configuracion.traduccion[22]);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource(
        "/imagenes/"+tema+"/openjdk-2.png")).getImage());
        cargar();
        lblGuardar.addMouseListener(this);
        lblCancelar.addMouseListener(this);
        rdbDificultadA.addItemListener(this);
        rdbDificultadB.addItemListener(this);
        rdbDificultadC.addItemListener(this);
        rdbAleatoriedadA.addItemListener(this);
        rdbAleatoriedadB.addItemListener(this);
        rdbAleatoriedadC.addItemListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDificultad = new javax.swing.ButtonGroup();
        btnAletoriedad = new javax.swing.ButtonGroup();
        lblDificultad = new javax.swing.JLabel();
        rdbDificultadA = new javax.swing.JRadioButton();
        rdbDificultadB = new javax.swing.JRadioButton();
        rdbDificultadC = new javax.swing.JRadioButton();
        lblAletoriedad = new javax.swing.JLabel();
        rdbAleatoriedadA = new javax.swing.JRadioButton();
        rdbAleatoriedadB = new javax.swing.JRadioButton();
        lblTitulo = new javax.swing.JLabel();
        rdbAleatoriedadC = new javax.swing.JRadioButton();
        lblGuardar = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sudoku 0.1 / Nivel de Dificultad");
        setResizable(false);

        lblDificultad.setText(configuracion.traduccion[23]);

        btgDificultad.add(rdbDificultadA);
        rdbDificultadA.setText(configuracion.traduccion[24]);

        btgDificultad.add(rdbDificultadB);
        rdbDificultadB.setText(configuracion.traduccion[25]);

        btgDificultad.add(rdbDificultadC);
        rdbDificultadC.setText(configuracion.traduccion[26]);

        lblAletoriedad.setText(configuracion.traduccion[27]);

        btnAletoriedad.add(rdbAleatoriedadA);
        rdbAleatoriedadA.setText(configuracion.traduccion[28]);

        btnAletoriedad.add(rdbAleatoriedadB);
        rdbAleatoriedadB.setText(configuracion.traduccion[29]);

        lblTitulo.setBackground(java.awt.Color.blue);
        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setForeground(java.awt.Color.white);
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(configuracion.traduccion[22]);
        lblTitulo.setOpaque(true);

        btnAletoriedad.add(rdbAleatoriedadC);
        rdbAleatoriedadC.setText(configuracion.traduccion[41]);

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/ok.gif")));
        lblGuardar.setToolTipText(configuracion.traduccion[20]);

        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/cancelar.gif")));
        lblCancelar.setToolTipText(configuracion.traduccion[21]);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDificultad)
                    .addComponent(lblAletoriedad)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbDificultadA)
                            .addComponent(rdbDificultadB)
                            .addComponent(rdbDificultadC)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbAleatoriedadA)
                                    .addComponent(rdbAleatoriedadB)
                                    .addComponent(rdbAleatoriedadC)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblDificultad)
                .addGap(18, 18, 18)
                .addComponent(rdbDificultadA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbDificultadB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbDificultadC)
                .addGap(18, 18, 18)
                .addComponent(lblAletoriedad)
                .addGap(12, 12, 12)
                .addComponent(rdbAleatoriedadA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbAleatoriedadB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbAleatoriedadC)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(null);

        setBounds(0, 0, 425, 362);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDificultad;
    private javax.swing.ButtonGroup btnAletoriedad;
    private javax.swing.JLabel lblAletoriedad;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdbAleatoriedadA;
    private javax.swing.JRadioButton rdbAleatoriedadB;
    private javax.swing.JRadioButton rdbAleatoriedadC;
    private javax.swing.JRadioButton rdbDificultadA;
    private javax.swing.JRadioButton rdbDificultadB;
    private javax.swing.JRadioButton rdbDificultadC;
    // End of variables declaration//GEN-END:variables
    private void cargar()
    {
        if(configuracion.dificultad==40)
        {
            rdbDificultadA.setSelected(true);
            rdbDificultadA.grabFocus();
            dificultad=40;
        }
        else if(configuracion.dificultad==30)
        {
            rdbDificultadB.setSelected(true);
            rdbDificultadB.grabFocus();
            dificultad=30;
        }
        else if(configuracion.dificultad==20)
        {
            rdbDificultadC.setSelected(true);
            rdbDificultadC.grabFocus();
            dificultad=20;
        }
        if(configuracion.aleatoriedad.compareTo("simple")==0)
        {
            rdbAleatoriedadA.setSelected(true);
            aleatoriedad="simple";
        }
        else if(configuracion.aleatoriedad.compareTo("compuesta")==0)
        {
            rdbAleatoriedadB.setSelected(true);
            aleatoriedad="compuesta";
        }
        else if(configuracion.aleatoriedad.compareTo("avanzada")==0)
        {
            rdbAleatoriedadC.setSelected(true);
            aleatoriedad="avanzada";
        }
    }

    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==rdbDificultadA)
        {
            dificultad=40;
        }
        else if(ie.getSource()==rdbDificultadB)
        {
            dificultad=30;
        }
        else if(ie.getSource()==rdbDificultadC)
        {
            dificultad=20;
        }
        else if(ie.getSource()==rdbAleatoriedadA)
        {
            aleatoriedad="simple";
        }
        else if(ie.getSource()==rdbAleatoriedadB)
        {
            aleatoriedad="compuesta";
        }
        else if(ie.getSource()==rdbAleatoriedadC)
        {
            aleatoriedad="avanzada";
        }
    }

    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==lblGuardar)
        {
            configuracion.modificarNivel(dificultad, aleatoriedad);
            this.dispose();
        }
        else if(me.getSource()==lblCancelar)
        {
            this.dispose();
        }
    }
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==lblGuardar)
        {
            lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/ok2.gif")));
        }
        else if(me.getSource()==lblCancelar)
        {
            lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/cancelar2.gif")));
        }
    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource()==lblGuardar)
        {
            lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/ok.gif")));
        }
        else if(me.getSource()==lblCancelar)
        {
            lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/cancelar.gif")));
        }
    }
}