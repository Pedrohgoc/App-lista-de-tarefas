import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListaDeTarefasGUI extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonTarefa1 = new JButton("Adicionar tarefa");
    private JButton jButtonTarefa2 = new JButton("Remover tarefa");
    private JButton jButtonTarefa3 = new JButton("Listar tarefas");


    public ListaDeTarefasGUI(){
        this.setTitle("Lista de tarefas - Interface Gráfica");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        ArrayList<String> tarefas = new ArrayList<String>();

        jButtonTarefa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tarefa = JOptionPane.showInputDialog(null, "Digite uma tarefa a ser adicionada: ");
                tarefas.add(tarefa);
            }
        });

        jButtonTarefa2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String indice1 = JOptionPane.showInputDialog(null, "Digite o número da tarefa a ser removida(a primeira é o 0)\n as tarefas são:  "+tarefas);
                int indice = Integer.parseInt(indice1);
                tarefas.remove(indice);
            }
        }));

        jButtonTarefa3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "as tarefas são: "+ tarefas);
            }
        });

        painel.add(jButtonTarefa1); painel.add(jButtonTarefa2); painel.add(jButtonTarefa3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {new ListaDeTarefasGUI();}
}

