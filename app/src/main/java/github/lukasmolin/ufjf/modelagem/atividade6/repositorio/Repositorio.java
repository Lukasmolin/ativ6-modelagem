package github.lukasmolin.ufjf.modelagem.atividade6.repositorio;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> info = new ArrayList<>();

    public void Adicionar(T entidade) {
        info.add(entidade);
    }

    public T get(T entidade) {
        if (info.contains(entidade))
            return entidade;

        return null;
    }

    public List<T> getTodos() {
        return new ArrayList<T>(info);
    }

}
