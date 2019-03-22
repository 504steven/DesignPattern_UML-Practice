    import java.util.ArrayList;
    
    public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    public Composite ( String d )
    {
        description = d ;
    }

    @Override
    public void printDescription() {
        System.out.println( description );
        System.out.println();
        System.out.println();
        for (Component obj  : components)
        {
            obj.printDescription();
            System.out.println();
            System.out.println();
        }
    }
    
     @Override
    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    @Override
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    @Override
    public Component getChild(int i) {
        return components.get( i ) ;
    }
     
}
 
