package pr0.ves.eliteboy.elitedangerous.journal.events

import pr0.ves.eliteboy.elitedangerous.journal.JournalEntry

import javax.persistence.Entity

@Entity
class LaunchFighter : JournalEntry() {
    var Loadout: String? = null
    var PlayerControlled: Boolean? = null
}