package priv.scor.lesson1.loop;

public class Class1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Class2 class1 = new Class2();
        Class2 class2 = new Class2();
        class1.setName("1");
        class2.setName("1");
        System.out.println(class1.equals(class2));
        System.out.println(class1==class2);
        
        int integer = new Integer(1);
        int integer2 = new Integer(1);
        
        System.out.println(integer==integer2);
        
        String a = new String("a");
        String b = new String("a");
        
        System.out.println(a==b);

    }

}

class Class2{
    private String name;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Class2 other = (Class2) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    
}


