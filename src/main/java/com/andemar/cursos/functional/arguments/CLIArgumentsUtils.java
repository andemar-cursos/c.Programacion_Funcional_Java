package com.andemar.cursos.functional.arguments;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    static void showHelp(CLIArguments cliArguments){

        Consumer<CLIArguments> consumerHelper = cliArgument -> {
            if(cliArgument.isHelp())
                System.out.println("Manual solicitado");
        };

        consumerHelper.accept(cliArguments);
    }

    static CLIArguments generateCLI() {
        Supplier<CLIArguments> generator = CLIArguments::new;

        return generator.get();
    }
}
