public abstract class FormaPagamento {
    public abstract void processarPagamento(double valor);
    public abstract boolean validarPagamento();
}

class CartaoCredito extends FormaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito: " + valor);
    }

    public boolean validarPagamento() {
        return true;
    }
}

class Boleto extends FormaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com boleto: " + valor);
    }

    public boolean validarPagamento() {
        return true;
    }
}

class Pix extends FormaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com Pix: " + valor);
    }

    public boolean validarPagamento() {
        return true;
    }
}

// No método principal
public class Main {
    public static void main(String[] args) {
        FormaPagamento[] pagamentos = { new CartaoCredito(), new Boleto(), new Pix() };
        for (FormaPagamento pagamento : pagamentos) {
            if (pagamento.validarPagamento()) {
                pagamento.processarPagamento(100.0);
            }
        }
    }
}
