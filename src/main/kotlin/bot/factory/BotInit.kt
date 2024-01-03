package bot.factory

class BotInit {
    val bot = BotFactory().createBot();
    val file : File = File("src/main/resources/commands.txt");
}