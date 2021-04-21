import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author Peyton Dunn
 * @version 4/21/21
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        super(800, 600, 1); 
        
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 12);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 12, 25 + 50*i);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 765 + 25,50*i );
        }
        
        //Partial wall in the top left of the maze
        for(int i = 0; i < 7; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 150);
        }
        //Partial wall above top left of the maze
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 190 + 25, 50*i);
        }
        //Partial wall above top left of the maze
        for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 400 + -39, 50*i);
        }
        //Partial wall connecting to/going across the top left
        for(int i = 0; i < 5; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 130);
        }
    }
}
