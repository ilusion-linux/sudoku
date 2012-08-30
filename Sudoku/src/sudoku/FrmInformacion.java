package sudoku;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

public class FrmInformacion extends JDialog implements ActionListener
{
    private Cargar configuracion;
    private String tema;

    public FrmInformacion(Frame parent, boolean modal, Cargar cargar)
    {
        super(parent, modal);
        configuracion=cargar;
        tema=configuracion.tema;
        initComponents();
        this.setTitle(configuracion.traduccion[30]);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource(
        "/imagenes/"+tema+"/openjdk-2.png")).getImage());
        txaInformacion.setSelectionStart(0);
        txaInformacion.setSelectionEnd(1);
        btnOK.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOK = new javax.swing.JButton();
        tbpPanel = new javax.swing.JTabbedPane();
        pnlAutor = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        pnlAutorInformacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        pnlAutorImagen = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        pnlInformacion = new javax.swing.JPanel();
        lblInformacion = new javax.swing.JLabel();
        scpInformacion = new javax.swing.JScrollPane();
        txaInformacion = new javax.swing.JTextArea();
        pnlTeclas = new javax.swing.JPanel();
        lblInformacion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sudoku 0.1 / Informacion");
        setResizable(false);

        btnOK.setText(configuracion.traduccion[40]);

        lblAutor.setBackground(java.awt.Color.blue);
        lblAutor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutor.setText(configuracion.traduccion[34]);
        lblAutor.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("Juego Sudoku");
        jLabel3.setPreferredSize(new java.awt.Dimension(135, 14));

        lbl1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbl1.setText(configuracion.traduccion[35]);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("ilusion.linux@gmail.com");

        lbl4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbl4.setText(configuracion.traduccion[38]);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Java SE");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel7.setText("Jdk1.6.0_11 ");

        jLabel9.setText("Guatemala 2,010");

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel12.setText("0.1");
        jLabel12.setPreferredSize(new java.awt.Dimension(135, 14));

        lbl2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbl2.setText(configuracion.traduccion[36]);

        lbl3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbl3.setText(configuracion.traduccion[37]);

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel15.setText("Ilusion-Linux");
        jLabel15.setPreferredSize(new java.awt.Dimension(135, 14));

        lbl5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbl5.setText(configuracion.traduccion[39]);

        pnlAutorImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlAutorImagenLayout = new javax.swing.GroupLayout(pnlAutorImagen);
        pnlAutorImagen.setLayout(pnlAutorImagenLayout);
        pnlAutorImagenLayout.setHorizontalGroup(
            pnlAutorImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAutorImagenLayout.setVerticalGroup(
            pnlAutorImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAutorInformacionLayout = new javax.swing.GroupLayout(pnlAutorInformacion);
        pnlAutorInformacion.setLayout(pnlAutorInformacionLayout);
        pnlAutorInformacionLayout.setHorizontalGroup(
            pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAutorInformacionLayout.createSequentialGroup()
                        .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(lbl5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAutorImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAutorInformacionLayout.setVerticalGroup(
            pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAutorImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAutorInformacionLayout.createSequentialGroup()
                        .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl3)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAutorInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21)
                        .addComponent(lbl5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        javax.swing.GroupLayout pnlAutorLayout = new javax.swing.GroupLayout(pnlAutor);
        pnlAutor.setLayout(pnlAutorLayout);
        pnlAutorLayout.setHorizontalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addComponent(pnlAutorInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 12, Short.MAX_VALUE))
            .addComponent(lblAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        pnlAutorLayout.setVerticalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAutorInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpPanel.addTab(configuracion.traduccion[31], pnlAutor);

        lblInformacion.setBackground(java.awt.Color.blue);
        lblInformacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInformacion.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion.setText("Sudoku 0.1");
        lblInformacion.setOpaque(true);

        scpInformacion.setBorder(null);
        scpInformacion.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaInformacion.setColumns(20);
        txaInformacion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txaInformacion.setLineWrap(true);
        txaInformacion.setRows(5);
        txaInformacion.setText("Esta es la primera version de este juego, que tiene fines puramente educativos.\n\nSudoku 0.1 es totalmente coigo abierto ya que su elaboracion fue principalmente para aprender y por tal  motivo esta  disponible para  todo aquel  que quiera conocer el  funcionamiento de  este juego y  la implementacion en java  (dicho funcionamiento y  implementacion segun  el autor;  se hace  la aclaracion ya que siempre existe mas de una solucion para todo problema).\n\nPuedes acceder al codigo fuente desde el Menu Principal  en la opcion Codigo Fuente. El cual puedes estudiarlo, modificarlo o pudes animarte y crear un Sudoku desde Cero tu tambien.\n\nToda la parte logica de la generacion de sudokus se encuentra en la clase Sudoku.\n\nSe tiene  contemplado una  nueva version de este   Juego, la cual contendra una mejora en  la Clase Sudoku y en la implementacion grafica.\n\nEste programa representa ejemplos basicos de aletoriedad, Thread, Manejo de Archivos, y una represtacion de la recursividad en un grado mayor. Por lo que este proyecto podria ser interesante para realizar una practica introducctoria de estos temas.\n\nSaludos a todos los que les parezca interesante este humilde programita\n\nilusion-linux\nilusion.linux.zacapalug.org");
        txaInformacion.setWrapStyleWord(true);
        txaInformacion.setOpaque(false);
        scpInformacion.setViewportView(txaInformacion);

        javax.swing.GroupLayout pnlInformacionLayout = new javax.swing.GroupLayout(pnlInformacion);
        pnlInformacion.setLayout(pnlInformacionLayout);
        pnlInformacionLayout.setHorizontalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
            .addComponent(scpInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        pnlInformacionLayout.setVerticalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addComponent(lblInformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
        );

        tbpPanel.addTab(configuracion.traduccion[32], pnlInformacion);

        lblInformacion1.setBackground(java.awt.Color.blue);
        lblInformacion1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInformacion1.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion1.setText(configuracion.traduccion[42]);
        lblInformacion1.setOpaque(true);

        javax.swing.GroupLayout pnlTeclasLayout = new javax.swing.GroupLayout(pnlTeclas);
        pnlTeclas.setLayout(pnlTeclasLayout);
        pnlTeclasLayout.setHorizontalGroup(
            pnlTeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInformacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        pnlTeclasLayout.setVerticalGroup(
            pnlTeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeclasLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblInformacion1)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        tbpPanel.addTab(configuracion.traduccion[33], pnlTeclas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbpPanel)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 543, 373);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblInformacion1;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JPanel pnlAutorImagen;
    private javax.swing.JPanel pnlAutorInformacion;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlTeclas;
    private javax.swing.JScrollPane scpInformacion;
    private javax.swing.JTabbedPane tbpPanel;
    private javax.swing.JTextArea txaInformacion;
    // End of variables declaration//GEN-END:variables
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnOK)
        {
            this.dispose();
        }
    }
}