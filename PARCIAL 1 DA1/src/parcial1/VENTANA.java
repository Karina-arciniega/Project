package parcial1;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class VENTANA extends JFrame
{

	public VENTANA()
	{
		//TITULO DE LA VENTANA
		super("TITULO DE LA VENTANA");
		//TAMAÑP DE LA VENTANA
		setSize(500,500);
		//COMO SE VAN A ACOMODAR LOS ELEMENTOS DE LA VENTANA
		setLayout(new FlowLayout());
		//PARA QUE SE CIERRE CON ELBOTON ROJO
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		
		VENTANA ventana = new VENTANA();
	}

}
