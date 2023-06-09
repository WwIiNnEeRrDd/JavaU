public class MovimientosCuenta {
    public float despositarDinero(float s, float d) {
        float saldoActualizado = s + d;
        return saldoActualizado;
    }

    public float retirarDinero(float s, float d) {
        float saldoActualizado = s - d;
        return saldoActualizado;
    }
}
