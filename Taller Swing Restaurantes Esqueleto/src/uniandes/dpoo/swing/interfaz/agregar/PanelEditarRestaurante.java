package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	
    	setLayout(new GridLayout(3, 2, 5, 5)); 
    	JLabel lblNombre=new JLabel("nombre del restaurante");
    	txtNombre =new JTextField();
    	add(lblNombre);
    	add(txtNombre);
        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	JLabel labelCalificacion = new JLabel("CALIFICACION DE 1 A 5");
    	String [] op= {"1","2","3","4","5"}; 
    	cbbCalificacion=new JComboBox<>(op);
    	add(labelCalificacion);
    	add(cbbCalificacion);

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
    	JLabel laVisitado = new JLabel("este restaurante ya visitado");
    	String [] opi = {"si", "no"};
    	cbbVisitado=new JComboBox<>(opi);
    	add(laVisitado);
    	add(cbbVisitado);

       
    	

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
    	String seleccion = (String)cbbVisitado.getSelectedItem();
        return seleccion.equals("si");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calificacion = (String)cbbCalificacion.getSelectedItem( );
        return Integer.parseInt(calificacion);
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	return txtNombre.getText().trim();
    }
}
