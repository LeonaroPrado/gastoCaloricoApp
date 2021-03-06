package nucleo.entidades_do_nucleo;

public class Categoria {
    private int id;
    private String categoria;
    private String descricao;

    public Categoria() {
    }

    public Categoria(int id) {
        this.id = id;
    }

    public Categoria(int id, String categoria, String descricao) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Categoria(String categoria, String descricao) {
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        //TODO:Implementar busca no banco de dados ao ser passado o id
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
