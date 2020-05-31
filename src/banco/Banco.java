package banco;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        
        classeBanco dados = new classeBanco();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua agenda: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: ")));
        dados.setSenha(JOptionPane.showInputDialog("Digite o número da sua senha: "));
        
        dados.logar(dados.getAgencia(), dados.getNumConta(),dados.getSenha());
        
    }
    
    
    
}
