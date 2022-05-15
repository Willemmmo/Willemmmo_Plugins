package pktools.ScriptCommandPkTools;

public class ScriptCommandFactoryPkTools
{
	public static ScriptCommandPkTools builder(final String scriptCommand)
	{
		switch (scriptCommand.toLowerCase())
		{
			case "rigour":
				return new RigourCommand();
			case "augury":
				return new AuguryCommand();
			case "piety":
				return new PietyCommand();
			case "incrediblereflexes":
				return new IncredibleReflexesCommand();
			case "ultimatestrength":
				return new UltimateStrengthCommand();
			case "steelskin":
				return new SteelSkinCommand();
			case "eagleeye":
				return new EagleEyeCommand();
			case "mysticmight":
				return new MysticMightCommand();
			case "protectfrommagic":
				return new ProtectFromMagicCommand();
			case "protectfrommelee":
				return new ProtectFromMeleeCommand();
			case "protectfrommissiles":
				return new ProtectFromMissilesCommand();
			case "freeze":
				return new FreezeCommand();
			case "firesurge":
				return new FireSurgeCommand();
			case "vengeance":
				return new VengeanceCommand();
			case "teleblock":
				return new TeleBlockCommand();
			case "entangle":
				return new EntangleCommand();
			case "spec":
				return new SpecCommand();
			case "wait":
				return new WaitCommand();
			case "clickenemy":
				return new ClickEnemyCommand();
			case "protectitem":
				return new ProtectItemCommand();
			case "opendoor":
				return new EnterDoorCommand();
			default:
				if (scriptCommand.toLowerCase().startsWith("group"))
				{
					return new GroupCommand(scriptCommand.replace("group", ""));
				}
				else if (scriptCommand.toLowerCase().startsWith("id_"))
				{
					return new ItemCommand(scriptCommand.replace("id_", ""));
				}
				else
				{
					return new ExceptionCommand();
				}
		}
	}
}