import net.bytebuddy.agent.ByteBuddyAgent;

public class Main {
    public static void main(String[] args) {
        ByteBuddyAgent.install(ByteBuddyAgent.AttachmentProvider.ForEmulatedAttachment.INSTANCE);
    }
}
