package com.andemar.cursos.jobsearch.cli;

import com.beust.jcommander.Parameter;
import lombok.Getter;
import lombok.Setter;

@Getter
public class CLIArguments {

    CLIArguments() {

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD")
    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada busqueda puede inclir una ubicacion"
    )
    private String location;

    @Parameter(
            names = {"--page", "-p"},
            description = "La API retorna 50 resultados"
    )
    private int page = 0;

    @Parameter(
            names = {"--full-time"},
            description = "Agregar si queremos trabajos de tiempo completo"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown"},
            description = "Obtener los resultados de markdown"
    )
    private boolean isMarkdown = false;

    @Parameter(
            names = {"--help"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Mostrar esta ayuda"
    )
    private boolean isHelp;

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }
}
