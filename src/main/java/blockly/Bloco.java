package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param Consulta a Entidades<app.entity.Produto>
 *
 * @author Ícaro Antunes
 * @since 22/08/2024, 12:09:51
 *
 */
public static Var Executar(@ParamMetaData(description = "Consulta_a_Entidades", id = "8fe423e9") Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades, Var.valueOf("quantidade")).compareTo(
    Var.valueOf(0)) <= 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("Quantidade n pdoe ser menor q zero"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

