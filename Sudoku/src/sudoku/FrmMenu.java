package sudoku;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class FrmMenu extends JFrame implements FocusListener, MouseListener,
WindowListener, KeyListener
{
    private Sudoku sudoku;
    private Cronometro cronometro;
    private Funciones funciones;
    private Cargar configuracion;
    private JTextField [][] txtTabla;
    private JPanel pnlCuadranteAuxiliar;
    private Font letra;
    private String tema;
    private int estado;
    private int xPausado;
    private int yPausado;
    private final int limite=9;

    public FrmMenu(Cargar cargar)
    {
        estado=0;
        letra=new Font("Arial", Font.PLAIN, 20);
        configuracion=cargar;
        configuracion.cargarTraduccion();
        tema=configuracion.tema;
        initComponents();
        sudoku=new Sudoku(configuracion.dificultad, configuracion.aleatoriedad);
        generarTabla();
        funciones=new Funciones(txtTabla);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource(
        "/imagenes/"+tema+"/openjdk-2.png")).getImage());
        this.addWindowListener(this);
        lblIniciar.addMouseListener(this);
        lblPausar.addMouseListener(this);
        lblLimpiar.addMouseListener(this);
        lblCambiar.addMouseListener(this);
        lblResolver.addMouseListener(this);
        lblCerrar.addMouseListener(this);
        lblAjustes.addMouseListener(this);
        lblNivel.addMouseListener(this);
        lblPunteos.addMouseListener(this);
        lblFuentes.addMouseListener(this);
        lblInformacion.addMouseListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTiempo = new javax.swing.JLabel();
        pnlMenuPrincipal = new javax.swing.JPanel();
        lblAjustes = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblPunteos = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblFuentes = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlCuadranteB = new javax.swing.JPanel();
        pnlCuadranteA = new javax.swing.JPanel();
        pnlCuadranteC = new javax.swing.JPanel();
        pnlCuadranteD = new javax.swing.JPanel();
        pnlCuadranteE = new javax.swing.JPanel();
        pnlCuadranteF = new javax.swing.JPanel();
        pnlCuadranteG = new javax.swing.JPanel();
        pnlCuadranteH = new javax.swing.JPanel();
        pnlCuadranteI = new javax.swing.JPanel();
        pnlControles = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        lblPausar = new javax.swing.JLabel();
        lblLimpiar = new javax.swing.JLabel();
        lblCambiar = new javax.swing.JLabel();
        lblResolver = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sudoku 0.1");
        setResizable(false);

        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTiempo.setText("00:00:00");
        lblTiempo.setToolTipText(configuracion.traduccion[1]);
        lblTiempo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), configuracion.traduccion[0], javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10)));

        pnlMenuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), configuracion.traduccion[9], javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10)));
        pnlMenuPrincipal.setLayout(null);

        lblAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/ajustes.gif")));
        lblAjustes.setToolTipText(configuracion.traduccion[10]);
        pnlMenuPrincipal.add(lblAjustes);
        lblAjustes.setBounds(20, 15, 35, 35);

        lblNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/nivel.gif")));
        lblNivel.setToolTipText(configuracion.traduccion[11]);
        pnlMenuPrincipal.add(lblNivel);
        lblNivel.setBounds(85, 15, 35, 35);

        lblPunteos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/puntuacion.gif")));
        lblPunteos.setToolTipText(configuracion.traduccion[12]);
        pnlMenuPrincipal.add(lblPunteos);
        lblPunteos.setBounds(150, 15, 35, 35);

        lblInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/informacion.gif")));
        lblInformacion.setToolTipText(configuracion.traduccion[14]);
        pnlMenuPrincipal.add(lblInformacion);
        lblInformacion.setBounds(280, 15, 35, 35);

        lblFuentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/fuentes.gif")));
        lblFuentes.setToolTipText(configuracion.traduccion[13]);
        pnlMenuPrincipal.add(lblFuentes);
        lblFuentes.setBounds(215, 15, 35, 35);

        pnlPrincipal.setToolTipText("Tabla de Sudoku");
        pnlPrincipal.setLayout(null);

        pnlCuadranteB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteB.setToolTipText("0-3");
        pnlCuadranteB.setLayout(null);
        pnlPrincipal.add(pnlCuadranteB);
        pnlCuadranteB.setBounds(105, 0, 105, 105);

        pnlCuadranteA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteA.setToolTipText("0-0");
        pnlCuadranteA.setLayout(null);
        pnlPrincipal.add(pnlCuadranteA);
        pnlCuadranteA.setBounds(2, 0, 105, 105);

        pnlCuadranteC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteC.setToolTipText("0-6");
        pnlCuadranteC.setLayout(null);
        pnlPrincipal.add(pnlCuadranteC);
        pnlCuadranteC.setBounds(208, 0, 105, 105);

        pnlCuadranteD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteD.setToolTipText("3-0");
        pnlCuadranteD.setLayout(null);
        pnlPrincipal.add(pnlCuadranteD);
        pnlCuadranteD.setBounds(2, 103, 105, 105);

        pnlCuadranteE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteE.setToolTipText("3-3");
        pnlCuadranteE.setLayout(null);
        pnlPrincipal.add(pnlCuadranteE);
        pnlCuadranteE.setBounds(105, 103, 105, 105);

        pnlCuadranteF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteF.setToolTipText("3-6");
        pnlCuadranteF.setLayout(null);
        pnlPrincipal.add(pnlCuadranteF);
        pnlCuadranteF.setBounds(208, 103, 105, 105);

        pnlCuadranteG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteG.setToolTipText("6-0");
        pnlCuadranteG.setLayout(null);
        pnlPrincipal.add(pnlCuadranteG);
        pnlCuadranteG.setBounds(2, 206, 105, 105);

        pnlCuadranteH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteH.setToolTipText("6-3");
        pnlCuadranteH.setLayout(null);
        pnlPrincipal.add(pnlCuadranteH);
        pnlCuadranteH.setBounds(105, 206, 105, 105);

        pnlCuadranteI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadranteI.setToolTipText("6-6");
        pnlCuadranteI.setLayout(null);
        pnlPrincipal.add(pnlCuadranteI);
        pnlCuadranteI.setBounds(208, 206, 105, 105);

        pnlControles.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), configuracion.traduccion[2], javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10)));
        pnlControles.setLayout(null);

        lblIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/empezar.gif")));
        lblIniciar.setToolTipText(configuracion.traduccion[3]);
        pnlControles.add(lblIniciar);
        lblIniciar.setBounds(15, 15, 15, 15);

        lblPausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/pausa.gif")));
        lblPausar.setToolTipText(configuracion.traduccion[4]);
        pnlControles.add(lblPausar);
        lblPausar.setBounds(40, 15, 15, 15);

        lblLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/limpiar.png")));
        lblLimpiar.setToolTipText(configuracion.traduccion[5]);
        pnlControles.add(lblLimpiar);
        lblLimpiar.setBounds(65, 15, 15, 15);

        lblCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+tema+"/reiniciar.gif")));
        lblCambiar.setToolTipText(configuracion.traduccion[6]);
        pnlControles.add(lblCambiar);
        lblCambiar.setBounds(90, 15, 15, 15);

        lblResolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/default/resolver.gif"))); // NOI18N
        lblResolver.setToolTipText(configuracion.traduccion[7]);
        pnlControles.add(lblResolver);
        lblResolver.setBounds(115, 15, 15, 15);

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/default/cerrar.gif"))); // NOI18N
        lblCerrar.setToolTipText(configuracion.traduccion[8]);
        pnlControles.add(lblCerrar);
        lblCerrar.setBounds(140, 15, 15, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(pnlControles, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-371)/2, (screenSize.height-459)/2, 371, 459);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblCambiar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblFuentes;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblPausar;
    private javax.swing.JLabel lblPunteos;
    private javax.swing.JLabel lblResolver;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlControles;
    private javax.swing.JPanel pnlCuadranteA;
    private javax.swing.JPanel pnlCuadranteB;
    private javax.swing.JPanel pnlCuadranteC;
    private javax.swing.JPanel pnlCuadranteD;
    private javax.swing.JPanel pnlCuadranteE;
    private javax.swing.JPanel pnlCuadranteF;
    private javax.swing.JPanel pnlCuadranteG;
    private javax.swing.JPanel pnlCuadranteH;
    private javax.swing.JPanel pnlCuadranteI;
    private javax.swing.JPanel pnlMenuPrincipal;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
    private void generarTabla()
    {
        int pX=3;
        int pY=2;
        txtTabla=new JTextField[limite][limite];
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                txtTabla[x][y]=new JTextField();
                txtTabla[x][y].setFont(letra);
                txtTabla[x][y].setForeground(Color.BLUE);
                txtTabla[x][y].setBounds(pX, pY, 34, 34);
                txtTabla[x][y].setHorizontalAlignment(JTextField.CENTER);
                txtTabla[x][y].setBorder(new javax.swing.border.LineBorder(Color.CYAN, 1));
                txtTabla[x][y].setToolTipText(x+"-"+y);
                txtTabla[x][y].setEnabled(false);
                determinarCuadrante(x, y);
                pnlCuadranteAuxiliar.add(txtTabla[x][y]);
                pX=pX+33;
                if((pX/33)==3)
                {
                    pX=3;
                }
            }
            pY=pY+33;
            if((pY/33)==3)
            {
                pY=2;
            }
        }
    }
    private void determinarCuadrante(int x, int y)
    {
        if(x<=2)
        {
            if(y<=2)
            {
                pnlCuadranteAuxiliar=pnlCuadranteA;
            }
            else if(y<=5)
            {
                pnlCuadranteAuxiliar=pnlCuadranteB;
            }
            else
            {
                pnlCuadranteAuxiliar=pnlCuadranteC;
            }
        }
        else if(x<=5)
        {
            if(y<=2)
            {

                pnlCuadranteAuxiliar=pnlCuadranteD;
            }
            else if(y<=5)
            {
                pnlCuadranteAuxiliar=pnlCuadranteE;
            }
            else
            {
                pnlCuadranteAuxiliar=pnlCuadranteF;
            }
        }
        else
        {
            if(y<=2)
            {
                pnlCuadranteAuxiliar=pnlCuadranteG;
            }
            else if(y<=5)
            {
                pnlCuadranteAuxiliar=pnlCuadranteH;
            }
            else
            {
                pnlCuadranteAuxiliar=pnlCuadranteI;
            }
        }
    }
    private void insertarEstablecidos()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                txtTabla[x][y].setText("");
                txtTabla[x][y].setBackground(Color.WHITE);
                if(sudoku.tablaLista[x][y]!=0)
                {
                    txtTabla[x][y].setText(Integer.toString(sudoku.tablaLista[x][y]));
                    txtTabla[x][y].setEnabled(false);
                    txtTabla[x][y].setBackground(Color.YELLOW);
                }
            }
        }
    }
    private void remarcarEstablecidos()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                if(sudoku.tablaLista[x][y]!=0)
                {
                    txtTabla[x][y].setEnabled(false);
                    txtTabla[x][y].setBackground(Color.YELLOW);
                }
            }
        }
    }
    private void pintarAreaActiva(int x, int y)
    {
        determinarCuadrante(x, y);
        int a=Integer.parseInt(pnlCuadranteAuxiliar.getToolTipText().substring(0, 1));
        int b=Integer.parseInt(pnlCuadranteAuxiliar.getToolTipText().substring(2, 3));
        for(int z=0; z<limite; z++)
        {
            txtTabla[x][z].setBackground(Color.LIGHT_GRAY);
            txtTabla[z][y].setBackground(Color.LIGHT_GRAY);
        }
        for(int z=a; z<=(a+2); z++)
        {
            for(int w=b; w<=(b+2); w++)
            {
                if(sudoku.tablaLista[z][w]==0)
                {
                    txtTabla[z][w].setBackground(Color.LIGHT_GRAY);
                }
            }
        }
        remarcarEstablecidos();
        txtTabla[x][y].setBackground(Color.WHITE);
    }
    private void limpiarAreaPerdida(int x, int y)
    {
        determinarCuadrante(x, y);
        int a=Integer.parseInt(pnlCuadranteAuxiliar.getToolTipText().substring(0, 1));
        int b=Integer.parseInt(pnlCuadranteAuxiliar.getToolTipText().substring(2, 3));
        for(int z=0; z<limite; z++)
        {
            txtTabla[x][z].setBackground(Color.WHITE);
            txtTabla[z][y].setBackground(Color.WHITE);
        }
        for(int z=a; z<=(a+2); z++)
        {
            for(int w=b; w<=(b+2); w++)
            {
                txtTabla[z][w].setBackground(Color.WHITE);
            }
        }
    }
    private void iniciarJuego()
    {
        sudoku.generandoSudoku();
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                txtTabla[x][y].setEnabled(true);
                txtTabla[x][y].addFocusListener(this);
                txtTabla[x][y].addKeyListener(this);
                if(sudoku.tablaLista[x][y]!=0)
                {
                    txtTabla[x][y].setText(Integer.toString(sudoku.tablaLista[x][y]));
                    txtTabla[x][y].setEnabled(false);
                    txtTabla[x][y].setBackground(Color.YELLOW);
                }
            }
        }
        insertarEstablecidos();
        lblIniciar.grabFocus();
        txtTabla[0][0].grabFocus();
        cronometro=new Cronometro(lblTiempo);
        try
        {
            cronometro.start();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "¡ERROR!", JOptionPane.OK_OPTION);
        }
    }
    private void pausarJuego()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                txtTabla[x][y].removeFocusListener(this);
                txtTabla[x][y].setEnabled(false);
                if(txtTabla[x][y].getBackground()==Color.RED)
                {
                    txtTabla[x][y].setText("");
                }
                txtTabla[x][y].setBackground(Color.WHITE);
            }
        }
        try
        {
            cronometro.suspend();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "¡ERROR!",
            JOptionPane.OK_OPTION);
        }
    }
    private void continuarJuego()
    {
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                txtTabla[x][y].addFocusListener(this);
                txtTabla[x][y].setEnabled(true);
            }
        }
        remarcarEstablecidos();
        txtTabla[xPausado][yPausado].grabFocus();
        try
        {
            cronometro.resume();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "¡ERROR!",
            JOptionPane.OK_OPTION);
        }
    }
    private void resolverJuego()
    {
        sudoku.copiarTabla();
        for(int x=0; x<limite; x++)
        {
            for(int y=0; y<limite; y++)
            {
                txtTabla[x][y].removeFocusListener(this);
                if(txtTabla[x][y].getBackground()!=Color.YELLOW)
                {
                    txtTabla[x][y].setBackground(Color.WHITE);
                }
                txtTabla[x][y].setText(Integer.toString(sudoku.tablaLista[x][y]));
                txtTabla[x][y].setEnabled(false);
            }
        }
        cronometro.stop();
    }
    private void limpiarSudoku()
    {
        insertarEstablecidos();
        cronometro.suspend();
        cronometro.resetearValores();
        cronometro.resume();
    }
    private void salir()
    {
        int accion=JOptionPane.showConfirmDialog(this, configuracion.traduccion[15],
        configuracion.traduccion[16], JOptionPane.OK_OPTION);
        if(accion==0)
        {
            if(cronometro!=null)
            {
                cronometro.stop();
            }
            System.exit(0);
        }
    }
    /*-----------------------------Gestores de Eventos----------------------------*/
    public void focusGained(FocusEvent ke)
    {
        JTextField temp=(JTextField) ke.getSource();
        int x=Integer.parseInt(temp.getToolTipText().substring(0, 1));
        int y=Integer.parseInt(temp.getToolTipText().substring(2, 3));
        xPausado=x;
        yPausado=y;
        pintarAreaActiva(x, y);
    }
    public void focusLost(FocusEvent ke)
    {
        JTextField temp=(JTextField) ke.getSource();
        int x=Integer.parseInt(temp.getToolTipText().substring(0, 1));
        int y=Integer.parseInt(temp.getToolTipText().substring(2, 3));
        if(temp.getBackground()==Color.RED)
        {
            temp.setText("");
            temp.setBackground(Color.WHITE);
        }
        limpiarAreaPerdida(x, y);
    }

    public void keyTyped(KeyEvent ke)
    {
        JTextField temp=(JTextField) ke.getSource();
        if(funciones.esDigito(ke.getKeyChar())==true)
        {
            int x=Integer.parseInt(temp.getToolTipText().substring(0, 1));
            int y=Integer.parseInt(temp.getToolTipText().substring(2, 3));
            if(temp.getText().compareTo("")!=0)
            {
                temp.setText("");
            }
            if(funciones.ingresoCorrecto(x, y, ke.getKeyChar()+"")==false)
            {
                temp.setBackground(Color.RED);
            }
            else
            {
                temp.setBackground(Color.WHITE);
            }
        }
        else if(ke.getKeyChar()=='0')
        {
            temp.setText("");
            ke.setKeyChar((char) 0);
            temp.setBackground(Color.WHITE);
        }
        else
        {
            ke.setKeyChar((char) 0);
        }
    }
    public void keyPressed(KeyEvent ke){}
    public void keyReleased(KeyEvent ke){}

    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==lblIniciar)
        {
            if(estado==0)
            {
                estado=1;
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar3.gif")));
                iniciarJuego();
            }
            else if(estado==2)
            {
                estado=1;
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar3.gif")));
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa.gif")));
                continuarJuego();
            }
        }
        else if(me.getSource()==lblPausar)
        {
            if(estado==1)
            {
                estado=2;
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa3.gif")));
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
                pausarJuego();
            }
        }
        else if(me.getSource()==lblLimpiar)
        {
            if(estado!=0)
            {
                lblLimpiar.setIcon(new ImageIcon(getClass().getResource(
                    "/imagenes/"+tema+"/limpiar3.png")));
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                    "/imagenes/"+tema+"/pausa.gif")));
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                    "/imagenes/"+tema+"/empezar3.gif")));
                lblLimpiar.setIcon(new ImageIcon(getClass().getResource(
                    "/imagenes/"+tema+"/limpiar.png")));
                limpiarSudoku();
            }
        }
        else if(me.getSource()==lblCambiar)
        {
            lblCambiar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/reiniciar3.gif")));
            lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa3.gif")));
            lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
            lblCambiar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/reiniciar.gif")));
            estado=2;
            cronometro.stop();
            limpiarSudoku();
            iniciarJuego();
            pausarJuego();
        }
        else if(me.getSource()==lblResolver)
        {
            if(estado!=0)
            {
                lblResolver.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/resolver3.gif")));
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa.gif")));
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
                lblResolver.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/resolver.gif")));
                resolverJuego();
                estado=0;
            }
        }
        else if(me.getSource()==lblCerrar)
        {
            lblCerrar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/cerrar3.gif")));
            salir();
        }
        else if(me.getSource()==lblAjustes)
        {
            if(estado==1)
            {
                estado=2;
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa3.gif")));
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
                pausarJuego();
            }
            FrmAjustes vtnAjustes=new FrmAjustes(this, true, configuracion);
            vtnAjustes.setLocationRelativeTo(this);
            vtnAjustes.setVisible(true);
        }
        else if(me.getSource()==lblNivel)
        {
            if(estado==1)
            {
                estado=2;
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa3.gif")));
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
                pausarJuego();
            }
            FrmNivel vtnNivel=new FrmNivel(this, true, configuracion);
            vtnNivel.setLocationRelativeTo(this);
            vtnNivel.setVisible(true);
        }
        else if(me.getSource()==lblFuentes)
        {
            if(estado==1)
            {
                estado=2;
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa3.gif")));
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
                pausarJuego();
            }
            
        }
        else if(me.getSource()==lblInformacion)
        {
            if(estado==1)
            {
                estado=2;
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa3.gif")));
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
                pausarJuego();
            }
            FrmInformacion vtnInformacion=new FrmInformacion(this, true, configuracion);
            vtnInformacion.setLocationRelativeTo(this);
            vtnInformacion.setVisible(true);
        }
    }
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==lblIniciar)
        {
            lblIniciar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/empezar2.gif")));
        }
        else if(me.getSource()==lblPausar)
        {
            lblPausar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/pausa2.gif")));
        }
        else if(me.getSource()==lblPunteos)
        {
            lblPunteos.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/puntuacion2.gif")));
        }
        else if(me.getSource()==lblLimpiar)
        {
            lblLimpiar.setIcon(new ImageIcon(getClass().getResource("/imagenes/"
                +tema+"/limpiar2.png")));
        }
        else if(me.getSource()==lblCambiar)
        {
            lblCambiar.setIcon(new ImageIcon(getClass().getResource("/imagenes/"
                +tema+"/reiniciar2.gif")));
        }
        else if(me.getSource()==lblResolver)
        {
            lblResolver.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/resolver2.gif")));
        }
        else if(me.getSource()==lblCerrar)
        {
            lblCerrar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/cerrar2.gif")));
        }
        else if(me.getSource()==lblAjustes)
        {
            lblAjustes.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/ajustes2.gif")));
        }
        else if(me.getSource()==lblNivel)
        {
            lblNivel.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/nivel2.gif")));
        }
        else if(me.getSource()==lblFuentes)
        {
            lblFuentes.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/fuentes2.gif")));
        }
        else if(me.getSource()==lblInformacion)
        {
            lblInformacion.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/informacion2.gif")));
        }
    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource()==lblIniciar)
        {
            if(estado==1)
            {
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar3.gif")));
            }
            else
            {
                lblIniciar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/empezar.gif")));
            }
        }
        else if(me.getSource()==lblPausar)
        {
            if(estado==2)
            {
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa3.gif")));
            }
            else
            {
                lblPausar.setIcon(new ImageIcon(getClass().getResource(
                "/imagenes/"+tema+"/pausa.gif")));
            }
        }
        else if(me.getSource()==lblPunteos)
        {
            lblPunteos.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/puntuacion.gif")));
        }
        else if(me.getSource()==lblLimpiar)
        {
            lblLimpiar.setIcon(new ImageIcon(getClass().getResource("/imagenes/"
                +tema+"/limpiar.png")));
        }
        else if(me.getSource()==lblCambiar)
        {
            lblCambiar.setIcon(new ImageIcon(getClass().getResource("/imagenes/"
                +tema+"/reiniciar.gif")));
        }
        else if(me.getSource()==lblResolver)
        {
            lblResolver.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/resolver.gif")));
        }
        else if(me.getSource()==lblCerrar)
        {
            lblCerrar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/cerrar.gif")));
        }
        else if(me.getSource()==lblAjustes)
        {
            lblAjustes.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/ajustes.gif")));
        }
        else if(me.getSource()==lblNivel)
        {
            lblNivel.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/nivel.gif")));
        }
        else if(me.getSource()==lblFuentes)
        {
            lblFuentes.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/fuentes.gif")));
        }
        else if(me.getSource()==lblInformacion)
        {
            lblInformacion.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/informacion.gif")));
        }
    }

    public void windowOpened(WindowEvent we){}
    public void windowClosing(WindowEvent we)
    {
        salir();
    }
    public void windowClosed(WindowEvent we){}
    public void windowIconified(WindowEvent we)
    {
        if(estado==1)
        {
            estado=2;
            lblPausar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/pausa3.gif")));
            lblIniciar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/empezar.gif")));
            pausarJuego();
        }
    }
    public void windowDeiconified(WindowEvent we){}
    public void windowActivated(WindowEvent we){}
    public void windowDeactivated(WindowEvent we)
    {
        if(estado==1)
        {
            estado=2;
            lblPausar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/pausa3.gif")));
            lblIniciar.setIcon(new ImageIcon(getClass().getResource(
            "/imagenes/"+tema+"/empezar.gif")));
            pausarJuego();
        }
    }
}