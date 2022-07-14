package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.util.Objects;

@ApplicationScoped
public class AlticciUseCase {

    Integer calculate(Integer n) {
        if(Objects.isNull(n))
            throw new IllegalArgumentException("Número não informado!");

        if(n < 0)
            throw new IllegalArgumentException("Números menores que ZERO não são calculados!");

        int result = n;
        if(result > 2) {
            for (int i = 0; i < n; i++) {
                result = calculate(n-3) + calculate(n-2);
            }
        } else
            result = result == 0 ? result : 1;

        return result;
    }
}

