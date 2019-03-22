  

public class BuildOrder {

    // public static Component getOrder()
    // {
        // Composite order = new Composite( "Order" ) ;
        // order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        // order.addChild(new Leaf("The Purist", 8.00 ));

        // CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // // base price for 1/3 lb
        // Burger b = new Burger( "Burger Options" ) ;
        // String[] bo = { "Beef", "1/3lb.", "On A Bun" } ;
        // b.setOptions( bo ) ;
        // // 1 cheese free, extra cheese +1.00
        // Cheese c = new Cheese( "Cheese Options" ) ;
        // String[] co = { "Danish Blue Cheese", "Horseradish Cheddar" } ;
        // c.setOptions( co ) ;
        // c.wrapDecorator( b ) ;
        // // 4 toppings free, extra +.75
        // Toppings t = new Toppings( "Toppings Options" ) ;
        // String[] to = { "Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw" } ;
        // t.setOptions( to ) ;
        // t.wrapDecorator( c ) ;
        // // premium topping +1.50
        // Premium p = new Premium( "Premium Options" ) ;
        // String[] po = { "Applewood Smoked Bacon" } ;
        // p.setOptions( po ) ;
        // p.wrapDecorator( t ) ;
        // // 1 sauce free, extra +.75
        // Sauce s = new Sauce( "Sauce Options" ) ;
        // String[] so = { "Appricot Sauce" } ;
        // s.setOptions( so ) ;
        // s.wrapDecorator( p ) ;
        
        // // Setup Custom Burger Ingredients
        // customBurger.setDecorator( s ) ;
        // customBurger.addChild( b ) ;
        // customBurger.addChild( c ) ;
        // customBurger.addChild( t ) ;
        // customBurger.addChild( p ) ;
        // customBurger.addChild( s ) ;
        
        // // Add Custom Burger to the ORder
        // order.addChild( customBurger );
        // return order ;
    // }
    
    public static Component getNewOrder()
    {
        Composite order = new Composite( "New Order" ) ;

        // 1st burger
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        
        //burger foundation
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        //System.out.println("-- burger price = " + b.getPrice());
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack"} ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //System.out.println("-- burger+cheese price = " + c.getPrice());
        
        
        // Premium cheese,  +1.00 for each
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        //System.out.println("-- burger+cheese+Pchesse price = " + pc.getPrice());
        
    
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        //System.out.println("-- burger+cheese+Pchesse+source price = " + s.getPrice());
        
        //  free toppings
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        //System.out.println("-- burger+cheese+Pchesse+source+top price = " + t.getPrice());
        
        // premium topping +1.00; Marinated Tomatoes + 3.00
        PremiumToppings pt = new PremiumToppings( "Premium Topping Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;      
        //System.out.println("-- burger+cheese+Pchesse+source+top+Ptopp price = " + pt.getPrice());
        
        // choose a bun
        Bun bun = new Bun( "Bun Options" ) ;
        String[] buno = { "Ciabatta(Vegan)" } ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( pt ) ;
        //System.out.println("-- burger+cheese+Pchesse+source+top+Ptopp+bun price = " + bun.getPrice());
        
        // choose a Side, +3.00
        Side side = new Side( "Side Options" ) ;
        String[] sideo = { "Shoestring Fries" } ;
        side.setOptions( sideo ) ;
        side.wrapDecorator( bun ) ;
        //System.out.println("-- burger+cheese+Pchesse+source+top+Ptopp+bun+side price = " + side.getPrice());
        
        //------------------------
       
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( pt ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;

        // Add Custom Burger to the ORder
        order.addChild( customBurger );
       
        
        //2nd burger
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        
        // Premium cheese,  +1.00 for each
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella"} ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;
        
        // 1 sauce free, extra +.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa"} ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        
        //  free toppings
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts"} ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        
        // premium toppings +1.00; Marinated Tomatoes + 3.00
        PremiumToppings pt2 = new PremiumToppings( "Premium Topping Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( po2 ) ;
        pt2.wrapDecorator( t2 ) ;
        
        // choose a bun
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] buno2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( buno2 ) ;
        bun2.wrapDecorator( pt2 ) ;
        
        // choose a Side, +3.00
        Side side2 = new Side( "Side Options" ) ;
        String[] sideo2 = { "Shoestring Fries" } ;
        side2.setOptions( sideo2 ) ;
        side2.wrapDecorator( bun2 ) ;
        
        //-----------------------------
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( pt2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( side2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/