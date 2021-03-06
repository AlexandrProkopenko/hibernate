package annotations.onetomany;

import annotations.onetomany.dao.impl.EntityDAOImpl;
import annotations.onetomany.entity.Child;
import annotations.onetomany.entity.Toy;



public class OneToManyApp {

    public static void main(String[] args) {
        EntityDAOImpl<Child> childDAO = new EntityDAOImpl<Child>(Child.class);
        EntityDAOImpl<Toy> toyDAO = new EntityDAOImpl<Toy>(Toy.class);

        for (int i = 1; i <6; i++) {
            System.out.println( childDAO.getById(new Long(i)) );
        }

    }
}
