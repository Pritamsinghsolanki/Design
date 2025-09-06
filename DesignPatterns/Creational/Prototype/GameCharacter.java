package org.example.DesignPatterns.Creational.Prototype;

public class GameCharacter implements Cloneable{
    private String type;
    public GameCharacter(String type)
    {
        this.type = type;
    }

    public void show()
    {
        System.out.println("Character type:"+type);
    }

    @Override
    public GameCharacter clone()
    {
        try{
            return (GameCharacter) super.clone();
        }catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}
