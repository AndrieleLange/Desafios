public class lingua {
    public static void main(String[] args) {
        String palavra = ""; 
        for (String args2 : args) {
            palavra += args2 + " ";
        };

        System.out.println(tradutorLinguaDoP(palavra));

        // System.out.println(tradutorLinguaDoP("pUpm pfpiplpmpe plpepgpapl"));
        // System.out.println(tradutorLinguaDoP("pA pppapppa pdpo pPpapppa"));
        
    }

    private static String tradutorLinguaDoP(String original){
        StringBuilder novaPalavra = new StringBuilder();


        for(int i = 0; i< original.length(); i++){
            if(original.charAt(i) == 'p'){
                i++;
                novaPalavra.append(original.charAt(i));
            } else {
                novaPalavra.append(original.charAt(i));
            }
        }
        return novaPalavra.toString();
    }
}
