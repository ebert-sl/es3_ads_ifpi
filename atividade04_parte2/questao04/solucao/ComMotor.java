package questao04.solucao;

public class ComMotor implements Movimento {
    private Motor motor;
    
    public void Mover() {
        motor.Ligar();
    }
}
