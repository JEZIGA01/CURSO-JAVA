package PROVAS;

import java.util.*;

class TESTE3 {

        public static void main (String[] args) {

            String[] frases = {
                    "Hello apple pie",
                    "No words"
            };

            String frase = frases [ 1 ];

            System.out.println ( frase );

            System.out.println ( searchChallenge ( frase ) );
        }

        //
        private static String searchChallenge ( String frase ) {

            String[] palavras = frase.split ( " " );

            int[] letras = new int [ palavras.length ];

            int[] letrasDaPalavra = new int [ 26 ];

            int maior   = 0,
                    posicao = 0,
                    l       = 0,
                    lp      = 0;

            for ( String palavra : palavras ) {

                lp = 0;

                for ( int letra = 'a' ; letra <= 'z' ; letra++ ) {

                    for ( int p = 0 ; p < palavra.length() ; p++ ) {

                        if ( palavra.toLowerCase().charAt ( p ) == letra ) {

                            letrasDaPalavra[lp]++;
                        }
                    }
                    lp++;
                }

                Arrays.sort ( letrasDaPalavra );

                letras[l++] = letrasDaPalavra [ letrasDaPalavra.length - 1 ];
            }

            maior   = letras[0];

            for ( l = 1 ; l < letras.length ; l++ ) {

                if ( letras[l] > maior ) {

                    maior   = letras[l];
                    posicao = l;
                }
            }

            if ( maior < 2 ) {

                return "-1";

            } else {

                return palavras [ posicao ];
            }
        }
    }