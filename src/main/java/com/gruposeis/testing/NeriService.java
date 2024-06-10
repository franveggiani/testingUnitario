package com.gruposeis.testing;

import org.springframework.stereotype.Service;

@Service
public class NeriService {

    public NeriService(){

    }
    public boolean esPar(int numero) {
        return numero % 2 == 0;
        }

        public boolean esPersonaAdulta(int edad){
        return edad >= 18;
        }

        public int duplicar(int numero){
        return numero * 2;
        }


}




