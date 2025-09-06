package org.example.DesignPatterns.Creational.Builder;


public class Burger {
    private String bun;
    private String patty;
    private boolean cheese;
    private boolean lettuce;


    Burger(Builder builder)
    {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
    }

    public void showBurger(){
        System.out.println("Burger with:"+bun+","+patty+
                (cheese ? ",cheese":"")+
                (lettuce ? "lettuce":""));
    }
    public static class Builder{
        private String bun;
        private String patty;
        private boolean cheese;
        private boolean lettuce;

        public Builder bun(String bun) { this.bun = bun;return this;}
        public Builder patty(String patty) { this.patty = patty; return this; }
        public Builder cheese(boolean cheese) { this.cheese = cheese; return this; }
        public Builder lettuce(boolean lettuce) { this.lettuce = lettuce; return this; }

        public Burger build()
        {
            return new Burger(this);
        }
    }
}
