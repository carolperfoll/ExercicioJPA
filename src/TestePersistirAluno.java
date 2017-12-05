
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestePersistirAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("ExercicioJPAPU");
        EntityManager em = enf.createEntityManager();
        Aluno oAluno = new Aluno();
        oAluno.setId(1);
        oAluno.setNome("Carol");
        oAluno.setEmail("carol@carol.com");
        oAluno.setEndereco("Rio do Sul");
        oAluno.setTelefone("88067701");
        
        em.getTransaction().begin();
        em.persist(oAluno);
        em.getTransaction().commit();
        em.close();
        enf.close();
    }
    
}
