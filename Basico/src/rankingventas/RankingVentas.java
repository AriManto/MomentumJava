package rankingventas;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class RankingVentas {
    double totalRecibidos, totalVentas,ranking;
    int corte=0;
    private static void crearVentana() {
        //Opciones básicas
        JFrame ventana = new JFrame("Ranking ventas");
        ventana.setSize(300, 300);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); //Centrar la ventana
        Paneles panelExterno = new Paneles();
        ventana.add(panelExterno);
        ventana.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> crearVentana());
        /*Solución sin interfaz gráfica
        Scanner leer = new Scanner(System.in);
        RankingVentas rv = new RankingVentas();
        do {
            System.out.println("Ingrese el total recibido");
            rv.totalRecibidos = leer.nextDouble();
            System.out.println("Ingrese el total de las ventas");
            rv.totalVentas = leer.nextDouble();
            rv.ranking = Math.floor(rv.totalRecibidos / rv.totalVentas); //Trunca el decimal
            System.out.printf("El ranking de ventas es de : 1/%.0f\n",rv.ranking); //Muestra el valor sin los decimales
            System.out.println("Cortar? 1/0");
            rv.corte = leer.nextInt();
        }
        while(!(rv.corte==1));
        */
    }
}
class Paneles extends JPanel {
    private GridBagConstraints gc = new GridBagConstraints();
    private void posicionCelda(int x, int y){ //
        gc.gridx=x;
        gc.gridy=y;
    }
    //Polimorfismo, para más opciones
    private void posicionCelda(int x, int y, double pesox, double pesoy){
        gc.gridx=x;
        gc.gridy=y;
        gc.weightx=pesox;
        gc.weighty=pesoy;
    }
    Paneles(){
        this.setBackground(new Color(236, 233, 216));
        this.setBorder(BorderFactory.createLineBorder(new Color(223, 225, 247), 5, true));
        this.setLayout(new GridBagLayout());
        gc.insets = new Insets(5,5,5,15);
        //Etiqueta 1
        JLabel etRecibidos = new JLabel("Total recibido:");
        gc.anchor=GridBagConstraints.EAST;
        posicionCelda(0,0,0.3,1);
        this.add(etRecibidos,gc);
        //Etiqueta 2
        JLabel etVentas = new JLabel("Total ventas:");
        posicionCelda(0,1,0.3,1);
        this.add(etVentas,gc);
        //Campo 1
        JTextField campoRecibidos = new JTextField();
        gc.fill=GridBagConstraints.HORIZONTAL;
        posicionCelda(1,0,1.7,1);
        this.add(campoRecibidos,gc);
        //Campo 2
        JTextField campoVentas = new JTextField();
        posicionCelda(1,1,1.7,1);
        this.add(campoVentas,gc);
        gc.fill=GridBagConstraints.NONE;
        //Botón calcular
        JButton btnCalc = new JButton("Calcular");
        posicionCelda(0,3,0.2,0.2);
        gc.gridwidth=2;
        gc.anchor=GridBagConstraints.CENTER;
        this.add(btnCalc,gc);
        //Etiqueta resultado
        gc.gridwidth=1;
        JLabel etResult = new JLabel ("Ranking ventas:");
        gc.anchor=GridBagConstraints.EAST;
        posicionCelda(0,2,1,1);
        this.add(etResult,gc);
        //Campo Resultado
        gc.fill = GridBagConstraints.HORIZONTAL;
        JTextField result = new JTextField();
        result.setEditable(false);
        posicionCelda(1,2,1,1);
        this.add(result,gc);
        //Botón exit
        JButton btnExit = new JButton("Salir");
        posicionCelda(1,3,1,1);
        gc.fill=GridBagConstraints.NONE;
        gc.gridwidth=1;
        gc.anchor=GridBagConstraints.EAST;
        this.add(btnExit,gc);
        //Oyente botón exit
        btnExit.addActionListener(e->
            System.exit(0));
        //Oyente calcular
        btnCalc.addActionListener(e->{
            Double recibidos = Double.parseDouble(campoRecibidos.getText());
            Double ventas = Double.parseDouble(campoVentas.getText());
            String resultado = Double.toString(Math.floor(recibidos/ventas));
            result.setText("1/"+resultado);
        });
    }
}
