package com.andemar.cursos.jobsearch;

import com.andemar.cursos.jobsearch.cli.CLIArguments;
import com.beust.jcommander.JCommander;

import static com.andemar.cursos.jobsearch.utils.CommanderFunctions.buildCommanderWithName;

public class JobSearch {

    public static void main(String[] args) {

        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);
    }
}
