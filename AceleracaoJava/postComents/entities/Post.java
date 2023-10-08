package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Post {
  private Date data;
  private String text;
  private List<Coment> comentarios = new ArrayList<>();

  public Post(Date data, String text) {
    super();
    this.data = data;
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getData() {
    return data;
  }

  public List<Coment> getComentarios() {
    return comentarios;
  }

  public void addComentario(Coment comentario) {
    this.comentarios.add(comentario);
  }

  public void removeComentario(Coment comentario) {
    this.comentarios.remove(comentario);
  }
}
