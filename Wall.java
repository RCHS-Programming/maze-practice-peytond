import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author Peyton Dunn 
 * @version 4/21/21
 */
public class Wall extends Actor
{
    private String image;
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Wall(String imageName)
    {
        image = imageName;
        setImage(image);
    }
}
