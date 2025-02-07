package img;

    import javax.swing.*;
    import java.awt.*;

public class JPanelConFondo extends JPanel {
     private Image imagen;

    public JPanelConFondo(String rutaImagen) {
        try {
            this.imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
        } catch (Exception e) {
            System.out.println("No se pudo cargar la imagen: " + rutaImagen);
            e.printStackTrace();
        }
        setOpaque(false); // Permite que los elementos sean visibles
        setLayout(new BorderLayout()); // Permite que los componentes se acomoden bien
    
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
