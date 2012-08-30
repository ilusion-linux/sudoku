package sudoku;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDialog;

public class FrmAjustes extends JDialog implements MouseListener, ItemListener
{
    private Cargar configuracion;
    private String tema;
    private String idioma;
    private String temaB;
    private String idiomaB;

    public FrmAjustes(Frame parent, boolean modal, Cargar cargar)
    {
        super(parent, modal);
        configuracion=cargar;
        tema=configuracion.tema;
        idioma=configuracion.idioma;
        initComponents();
        this.setTitle(configuracion.traduccion[17]);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource(
        "/imagenes/"+tema+"/openjdk-2.png")).getImage());
        cargarConfiguracion();
        lblGuardar.addMouseListener(this);
        lblCancelar.addMouseListener(this);
        rdbDefault.addItemListener(this);
        rdbBlack.addItemListener(this);
        rdbNaruto.addItemListener(this);
        rdbLinux.addItemListener(this);
        rdbDebian.addItemListener(this);
        rdbTux.addItemListener(this);
        rdbUbuntu.addItemListener(this);
        rdbWin7.addItemListener(this);
        rdbEspanol.addItemListener(this);
        rdbIngles.addItemListener(this);
        rdbItaliano.addItemListener(this);
        rdbFrances.addItemListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTemas = new javax.swing.ButtonGroup();
        btgIdiomas = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        rdbDefault = new javax.swing.JRadioButton();
        rdbBlack = new javax.swing.JRadioButton();
        rdbNaruto = new javax.swing.JRadioButton();
        rdbLinux = new javax.swing.JRadioButton();
        rdbDebian = new javax.swing.JRadioButton();
        rdbTux = new javax.swing.JRadioButton();
        rdbUbuntu = new javax.swing.JRadioButton();
        rdbWin7 = new javax.swing.JRadioButton();
        lbl2 = new javax.swing.JLabel();
        rdbEspanol = new javax.swing.JRadioButton();
        rdbIngles = new javax.swing.JRadioButton();
        rdbItaliano = new javax.swing.JRadioButton();
        rdbFrances = new javax.swing.JRadioButton();
        lblGuardar = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitulo.setBackground(java.awt.Color.blue);
        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setForeground(java.awt.Color.white);
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(configuracion.traduccion[17]);
        lblTitulo.setOpaque(true);

        lbl1.setText(configuracion.traduccion[17]);

        btgTemas.add(rdbDefault);
        rdbDefault.setText("Default");

        btgTemas.add(rdbBlack);
        rdbBlack.setText("Black");
        rdbBlack.setEnabled(false);

        btgTemas.add(rdbNaruto);
        rdbNaruto.setText("Naruto");
        rdbNaruto.setEnabled(false);

        btgTemas.add(rdbLinux);
        rdbLinux.setText("Linux");
        rdbLinux.setEnabled(false);

        btgTemas.add(rdbDebian);
        rdbDebian.setText("Debian");
        rdbDebian.setEnabled(false);

        btgTemas.add(rdbTux);
        rdbTux.setText("Tux");
        rdbTux.setEnabled(false);

        btgTemas.add(rdbUbuntu);
        rdbUbuntu.setText("Ubuntu");
        rdbUbuntu.setEnabled(false);

        btgTemas.add(rdbWin7);
        rdbWin7.setText("Gentoo");
        rdbWin7.setEnabled(false);

        lbl2.setText(configuracion.traduccion[19]);

        btgIdiomas.add(rdbEspanol);
        rdbEspanol.setText("Español (Default)");

        btgIdiomas.add(rdbIngles);
        rdbIngles.setText("Ingles");

        btgIdiomas.add(rdbItaliano);
        rdbItaliano.setText("Italiano");

        btgIdiomas.add(rdbFrances);
        rdbFrances.setText("Frances");

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/ok.gif")));
        lblGuardar.setToolTipText(configuracion.traduccion[20]);

        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/cancelar.gif")));
        lblCancelar.setToolTipText(configuracion.traduccion[21]);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbDefault)
                                    .addComponent(rdbBlack)
                                    .addComponent(rdbNaruto))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbTux)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbLinux)
                                            .addComponent(rdbDebian))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbWin7)
                                            .addComponent(rdbUbuntu)
                                            .addComponent(rdbIngles)
                                            .addComponent(rdbFrances)))))
                            .addComponent(rdbEspanol)
                            .addComponent(rdbItaliano)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbDefault)
                    .addComponent(rdbLinux)
                    .addComponent(rdbUbuntu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbBlack)
                    .addComponent(rdbDebian)
                    .addComponent(rdbWin7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbTux)
                    .addComponent(rdbNaruto))
                .addGap(20, 20, 20)
                .addComponent(lbl2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbEspanol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbItaliano))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbIngles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbFrances)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 406, 331);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgIdiomas;
    private javax.swing.ButtonGroup btgTemas;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdbBlack;
    private javax.swing.JRadioButton rdbDebian;
    private javax.swing.JRadioButton rdbDefault;
    private javax.swing.JRadioButton rdbEspanol;
    private javax.swing.JRadioButton rdbFrances;
    private javax.swing.JRadioButton rdbIngles;
    private javax.swing.JRadioButton rdbItaliano;
    private javax.swing.JRadioButton rdbLinux;
    private javax.swing.JRadioButton rdbNaruto;
    private javax.swing.JRadioButton rdbTux;
    private javax.swing.JRadioButton rdbUbuntu;
    private javax.swing.JRadioButton rdbWin7;
    // End of variables declaration//GEN-END:variables
    public void cargarConfiguracion()
    {
        if(tema.compareTo("default")==0)
        {
            rdbDefault.setSelected(true);
            rdbDefault.grabFocus();
            temaB="default";
        }
        else if(tema.compareTo("black")==0)
        {
            rdbBlack.setSelected(true);
            rdbBlack.grabFocus();
            temaB="black";
        }
        else if(tema.compareTo("naruto")==0)
        {
            rdbNaruto.setSelected(true);
            rdbNaruto.grabFocus();
            temaB="naruto";
        }
        else if(tema.compareTo("linux")==0)
        {
            rdbLinux.setSelected(true);
            rdbLinux.grabFocus();
            temaB="linux";
        }
        else if(tema.compareTo("debian")==0)
        {
            rdbDebian.setSelected(true);
            rdbDebian.grabFocus();
            temaB="debian";
        }
        else if(tema.compareTo("tux")==0)
        {
            rdbTux.setSelected(true);
            rdbTux.grabFocus();
            temaB="tux";
        }
        else if(tema.compareTo("ubuntu")==0)
        {
            rdbUbuntu.setSelected(true);
            rdbUbuntu.grabFocus();
            temaB="ubuntu";
        }
        else if(tema.compareTo("win 7")==0)
        {
            rdbWin7.setSelected(true);
            rdbWin7.grabFocus();
            temaB="win 7";
        }
        if(idioma.compareTo("espanol")==0)
        {
            rdbEspanol.setSelected(true);
            idiomaB="espanol";
        }
        else if(idioma.compareTo("ingles")==0)
        {
            rdbIngles.setSelected(true);
            idiomaB="ingles";
        }
        else if(idioma.compareTo("italiano")==0)
        {
            rdbItaliano.setSelected(true);
            idiomaB="italiano";
        }
        else if(idioma.compareTo("frances")==0)
        {
            rdbFrances.setSelected(true);
            idiomaB="frances";
        }
    }

    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==rdbDefault)
        {
            temaB="default";
        }
        else if(ie.getSource()==rdbBlack)
        {
            temaB="black";
        }
        else if(ie.getSource()==rdbNaruto)
        {
            temaB="naruto";
        }
        else if(ie.getSource()==rdbLinux)
        {
            temaB="linux";
        }
        else if(ie.getSource()==rdbDebian)
        {
            temaB="debian";
        }
        else if(ie.getSource()==rdbTux)
        {
            temaB="tux";
        }
        else if(ie.getSource()==rdbUbuntu)
        {
            temaB="ubuntu";
        }
        else if(ie.getSource()==rdbWin7)
        {
            temaB="win 7";
        }
        else if(ie.getSource()==rdbEspanol)
        {
            idiomaB="espanol";
        }
        else if(ie.getSource()==rdbIngles)
        {
            idiomaB="ingles";
        }
        else if(ie.getSource()==rdbItaliano)
        {
            idiomaB="italiano";
        }
        else if(ie.getSource()==rdbFrances)
        {
            idiomaB="frances";
        }
    }

    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==lblGuardar)
        {
            configuracion.modificarConfiguracion(temaB, idiomaB);
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