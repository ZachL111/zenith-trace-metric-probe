# zenith-trace-metric-probe

`zenith-trace-metric-probe` is a compact Scala repository for observability, centered on this goal: Package a Scala local lab for metric analysis with node-edge fixtures, cycle and reachability reports, and documented operating limits.

## Use Case

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Zenith Trace Metric Probe Review Notes

`recovery` and `baseline` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Highlights

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/zenith-trace-metric-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `incident shape` and `span volume`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The added Scala path is deliberately direct, with fixtures doing most of the explaining.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The check exercises the source code and the review fixture. `recovery` is the high score at 255; `baseline` is the low score at 134.

## Future Work

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
