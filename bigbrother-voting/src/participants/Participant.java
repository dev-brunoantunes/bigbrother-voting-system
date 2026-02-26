package participants;

public class Participant {

    String participantName;
    int votes;

    public void voteFunction(){
        votes++;
        System.out.println("Até o momento! O participante: " + participantName + " recebeu: " + votes + " votos!");
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public int getVotes() {
        return votes;
    }

}
