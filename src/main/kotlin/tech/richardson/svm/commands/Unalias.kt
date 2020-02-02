package tech.richardson.svm.commands

import org.web3j.sokt.SolcInstance
import org.web3j.sokt.SolcRelease
import tech.richardson.svm.Command
import tech.richardson.svm.Constants

class Unalias : Command {
    override fun matches(arg: String, len: Int): Boolean {
        return arg == "unalias" && len == 2
    }

    override fun execute(args: List<String>): String {
        val instance = SolcInstance(SolcRelease(args.first().trim()), Constants.SVM_PATH)

        return "The version ${instance.solcRelease.version} is not installed."
    }
}