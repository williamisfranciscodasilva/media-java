import javax.swing.JOptionPane;
class media
{
   public static void main(String args[])
   {
      float nota1, nota2, nota3, nota4, calc_media;
      nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
      nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
      nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
      nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota: "));
      calc_media = (nota1 + nota2 + nota3 + nota4) / 4;
      System.out.println("A media = "+calc_media);
      JOptionPane.showMessageDialog(null,"A média = "+calc_media);
   }
}