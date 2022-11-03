package br.com.cod3r.cm.visao;
import br.com.cod3r.cm.modelo.Tabuleiro;
import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame
{
    public TelaPrincipal()
    {
        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
        add(new PainelTabuleiro(tabuleiro));


        setTitle("Campo Minado Iury Pedrosa");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new TelaPrincipal();
    }
}
