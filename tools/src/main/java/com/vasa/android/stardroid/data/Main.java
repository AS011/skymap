package com.vasa.android.stardroid.data;

import java.io.IOException;

/**
 * A frontend to the the various writers, since gradle appears unable to create separate
 * application distributions despite documentation to the contrary.
 * Usage:
 *   java Main <command> <args>
 *
 *   where command is one of GenStars, GenMessier, Rewrite, Binary
 *   See the various writer classes for the args.
 */
public class Main {
  private enum Command {
    GenStars, GenMessier, Rewrite, Binary
  }

  public static void main(String[] in) throws IOException {
    if (in.length < 2) {
      throw new IllegalArgumentException(
          "Usage: java Main <command> <args>");
    }
    Command command = Command.valueOf(in[0]);
    String[] args = new String[in.length - 1];
    for (int cnt = 1; cnt < in.length; cnt++) {
      args[cnt - 1] = in[cnt];
    }
    switch (command) {
      case GenStars:
        StellarProtoWriter.main(args);
        break;
      case GenMessier:
        MessierProtoWriter.main(args);
        break;
      case Rewrite:
        AsciiProtoRewriter.main(args);
        break;
      case Binary:
        AsciiToBinaryProtoWriter.main(args);
        break;
      default:
        throw new IllegalArgumentException("Unknown command");
    }
  }
}
