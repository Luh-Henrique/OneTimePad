package OneTimePad;

public class OneTimePad{

    public String encrypt(int mensagem, int key){
        char[] mensagemBin = toBinary(mensagem).toCharArray();
        char[] keyBin = toBinary(key).toCharArray();
        
        char[] cipherInt = new char[mensagemBin.length];
        
        for (int i = 0; i < mensagemBin.length; i++){
        // If the Character matches
        if (mensagemBin[i] == keyBin[i])
            cipherInt[i] = '0';
        else
            cipherInt[i] = '1';
    }
        return new String(cipherInt);
    }
    
    public String decrypts(String mensagem, int key){
        char[] mensagemBin = mensagem.toCharArray();
        char[] keyBin = toBinary(key).toCharArray();
        
        char[] cipherInt = new char[mensagemBin.length];
        
        for (int i = 0; i < mensagemBin.length; i++){
        // If the Character matches
        if (mensagemBin[i] == keyBin[i])
            cipherInt[i] = '0';
        else
            cipherInt[i] = '1';
    }
        return new String(cipherInt);
    }
    
    
    public static void main(String[] args){
        OneTimePad otp = new OneTimePad();
        int mensagem = 164;
        int key = 205;
        
        String cifra = otp.encrypt(mensagem, key);
        
        System.out.println("\nMensagem: "+mensagem+"\nMensagemBinario: "+otp.toBinary(mensagem)+"\nKey: "+key+"\nKey Binario:"+otp.toBinary(key));
        System.out.println("\nCriptografado:\nBinario: "+cifra+"\nDecimal: "+otp.toDecimal(cifra));
        
        String descifra = otp.decrypts(cifra, key);
        
        System.out.println("\nDescifrado:\nBinario: "+descifra+"\nDecimal: "+otp.toDecimal(descifra));
    }
    
    public String toBinary(int decimal){
	return Integer.toBinaryString(decimal);     
    }
    
    public int toDecimal(String binary){
	return Integer.parseInt(binary,2);     
    }
}