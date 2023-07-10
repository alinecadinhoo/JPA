import Dao.IProdutoDao;
import Dao.ProdutoDao;
import Domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A");
        produto.setNome("Camiseta");
        produto.setPreco(50d);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

    }

}
