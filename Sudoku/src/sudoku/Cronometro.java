package sudoku;

import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro extends Thread
{
    private JLabel lblTime;
    private NumberFormat nf;
    private int segundos;
    private int minutos;
    private int horas;

    public Cronometro(JLabel time)
    {
        lblTime=time;
        nf=NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(2);
        segundos=0;
        minutos=0;
        horas=0;
    }

    @Override
    public void run()
    {
        while(horas>=0)
        {
            try
            {
                Thread.sleep(1000);
                ++segundos;
                if(segundos==60)
                {
                    segundos=0;
                    ++minutos;
                }
                if(minutos==60)
                {
                    minutos=0;
                    ++horas;
                }
                lblTime.setText(nf.format(horas)+":"+nf.format(minutos)+":"+nf.format(segundos));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                JOptionPane.OK_OPTION);
            }
        }
    }
    public void resetearValores()
    {
        segundos=minutos=horas=0;
    }
}