import javax.imageio.ImageIO;


public class OBJ_Chest extends SuperObject{

    public OBJ_Chest(){

        name = "Chest";
        try {
            
            image = ImageIO.read(getClass().getResourceAsStream("/src/Objects/chest.png"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

}