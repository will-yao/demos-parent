package InvokerChain;

import java.util.LinkedList;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/5/19
 **/
public class InvokerChain {

    private LinkedList<Instruction> instructions = new LinkedList<>();

    public static InvokerChain instance() {
        return new InvokerChain();
    }

    /**
     * 增加指令
     *
     * @param instruction 指令
     * @return
     */
    public InvokerChain addInstruction(Instruction instruction) {
        instructions.add(instruction);
        return this;
    }

    /**
     * 运行
     *
     * @return
     */
    public void run() throws Throwable {
        LinkedList<Instruction> instructionsRun = new LinkedList<>(instructions);
        try {
            for (Instruction instruction : instructionsRun) {
                instruction.execute();
            }
        } catch (Throwable t) {
            throw t;
        }
    }


    @FunctionalInterface
    public interface Instruction {

        void execute() throws Throwable;
    }
}
