import java.util.Scanner;

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            throw new IllegalArgumentException("El depósito debe ser positivo");
        }
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (saldo < monto) {
            throw new FondosInsuficientesException("Fondos insuficientes para esta operación");
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class BancoSimulacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(saldoInicial);

        try {
            while (true) {
                System.out.println("\nOpciones:");
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.println("3. Ver saldo");
                System.out.println("4. Salir");

                System.out.print("Ingrese su opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la cantidad para depositar: ");
                        double montoDepositar = scanner.nextDouble();
                        cuenta.depositar(montoDepositar);
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad para retirar: ");
                        double montoRetirar = scanner.nextDouble();
                        cuenta.retirar(montoRetirar);
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                        break;
                    case 3:
                        System.out.println("Saldo actual: $" + cuenta.getSaldo());
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Opción inválida");
                }
            }
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
